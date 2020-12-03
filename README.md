# melior

Team Name: Sophisticationesteralizationoratorology Group
Team Members: Nitin, Guh, and Aditya
Project Title: Melior 

Problem: Studies show that the habits of instant messaging and online communication diminishes people’s quality of writing and communication. In the expansive and efficient modern world, a degradation of vocabulary leads to countless issues and bottlenecks which affect productivity. Besides hindering people’s ability to communicate their ideas and intentions, people may lose the joy and appreciation for quality writing achieved with elevated diction. Thus, we seek to assist, teach, and support people’s writing endeavors to reverse these unfortunate trends in communicative literacy.

Motivation: As computer science students interested in the beauty of writing, my team members and I have often found ourselves in scenarios where bad writing habits, propagated by texting and online messaging, damage the quality of our writing. We realize that these habits are detrimental to our ability to communicate our thoughts, messages, and ideas. Since writing is a critical aspect of many fields across various sectors, we realized that there could be wide-spread impact if we could improve the quality of people’s writing.

Features: We will know that we have accomplished our goal when the program has the functional capabilities to enhance a sentence by inserting a more sophisticated word with the most nuances to the original word into its correct compartment.

Use an open digital thesaurus library to build an unordered map of words with keys being the words themselves and holding data on their synonyms.
Parse and process all 6000 SAT vocabulary words.
Use the Thesaurus API to associate SAT synonyms with keywords within the map.
Create a system for determining the difficulty of any given SAT word, organize them by least to most difficulty in a min-heap structure, allowing the user to pick a level of difficulty.
Create a main program to parse sentences and replace key words with SAT synonyms in our data structure. 
Include functionality to provide multiple sentence options interchanging synonyms, store, and copy to clipboard.
Build an intuitive website for users to input text and get immediate results

Data: 
WordNet and SAT list
Each data object (row of the table) has an entry for synset type (noun, verb, adjective, adverb etc.), the word, synonyms, and more characteristics of each word. 

Tools: Javascript, HTML, CSS, Java, Python

Visuals:

Strategy:
We have an unordered map containing every word within Wordnet, a digital English database with over 150,000 words. Each word will be the keys of the map and the associated values are objects that hold a priority queue of synonymous words and a bool value that marks the key word for potential replacement. 

Meanwhile we will extract a list of 6000 SAT vocabulary words provided by an online resource. We mark the words within the database word map that are also contained by the SAT vocabulary list using the bool value. These SAT words become potential synonym replacements within the map.These synonyms will also be assigned a difficulty rating for personalization.

Users can enter a sentence into our website. Our main program will take sentences and parse each individual word. We search for the words within our map and see if any associated synonyms can be found that are marked as potential replacements. These words are then presented by our website organized by order of difficulty determined by the priority queue.
