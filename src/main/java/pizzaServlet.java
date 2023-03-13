import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

@WebServlet("/pizza")
public class pizzaServlet  extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{

            String crust = (request.getParameter("crust"));
            String sauce = (request.getParameter("sauce"));
            String size = (request.getParameter("size"));
            String address = (request.getParameter("address"));
        if (request.getMethod().equalsIgnoreCase("post")) {
            if(request.getParameter("topping1")!=null){
                System.out.println("pepperoni");
            }
            if(request.getParameter("topping2")!=null){
                System.out.println("pineapple");
            }
            if(request.getParameter("topping3")!=null){
                System.out.println("ham");
            }
            if(request.getParameter("topping4")!=null){
                System.out.println("sausage");
            }
        }
        PrintWriter out= response.getWriter();
             System.out.println(crust);
            System.out.println(sauce);
            System.out.println(size);
            System.out.println(address);
            out.println(address);
            out.println(crust);
            out.println(sauce);
            out.println(size);
            out.close();
    }
}
