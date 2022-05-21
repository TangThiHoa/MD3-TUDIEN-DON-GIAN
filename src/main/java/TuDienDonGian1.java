import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "TuDienDonGian1", urlPatterns = "/TuDienDonGian")
public class TuDienDonGian1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        Map<String, String> dictionary = new HashMap<>();
//        dictionary.put("hello", "Xin chào");
//        dictionary.put("how", "Thế nào");
//        dictionary.put("book", "Quyển vở");
//        dictionary.put("computer", "Máy tính");
//
//        String search = request.getParameter("search");                        //yêu cầu
//        PrintWriter printWriter = response.getWriter();                              //Trả về
//        printWriter.print("<html>");
//
//        String result = dictionary.get(search);
//        if (result != null){
//            printWriter.print("Word :"+ search);
//            printWriter.print("Result :"+ result);
//        }else {
//            printWriter.print("Not founf");
//        }printWriter.print("/html");
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "Xin chào");
        dictionary.put("how", "Thế nào");
        dictionary.put("book", "Quyển vở");
        dictionary.put("computer", "Máy tính");

        String search = request.getParameter("search");                        //yêu cầu
        PrintWriter printWriter = response.getWriter();                              //Trả về
        printWriter.print("<html>");

        String result = dictionary.get(search);
        if (result != null){
            printWriter.print("Word : "+ search);
            printWriter.print("           ");
            printWriter.print("Result :"+ result);
        }else {
            printWriter.print("Not founf");
        }printWriter.print("</html>");
    }
}
