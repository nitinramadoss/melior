import javax.servlet.http.*;  
import javax.servlet.*;  
import java.io.*;  

/**
 * Servlet that retreives entities from the ReadData class and adds them to data store if they are
 * not already present
 */
@WebServlet("/data")
public class DataServlet extends HttpServlet {
  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
    DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();

    ReadData readData = new ReadData(new SentimentData());
    ArrayList<Entity> allEntities = readData.allEntitiesFromFiles();

    for (int i = 0; i < allEntities.size(); i++) {
      Entity currentEntity = allEntities.get(i);

      try {
        datastore.get(currentEntity.getKey());
      } catch (EntityNotFoundException e) {
        continue;
      }

      allEntities.remove(i);

      i -= 1;
    }

    datastore.put(allEntities);

    response.sendRedirect("/index.html");
  }
}
