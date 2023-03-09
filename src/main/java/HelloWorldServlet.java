import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
    @Override

//        protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//            res.getWriter().println("<div id='count'></div><script> let i = localStorage.getItem('count') || 0;\n" +
//                    "  i++;\n" +
//                    "  localStorage.setItem('count', i);let numCount=document.querySelector('#count'); numCount.innerHTML=i</script>");
//        }
//    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//        res.getWriter().println("<div>Hello World</div>");
        PrintWriter pw=res.getWriter();
        String word= req.getParameter("name");
        if (word == null){
            pw.println("hello world");
        }else{
            pw.println("hello " + word + ".");
        }
    }
}


