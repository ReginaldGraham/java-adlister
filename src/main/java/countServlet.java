import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

    @WebServlet("/count")
public class countServlet extends HttpServlet{
 @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.getWriter().println("<div id='count'></div><script> let i = localStorage.getItem('count') || 0;\n" +
                "  i++;\n" +
                "  localStorage.setItem('count', i);let numCount=document.querySelector('#count'); numCount.innerHTML=i</script>");
    }

}
