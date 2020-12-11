package servlerts;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Bohdan Vakaliuk
 * @version 12.12.2020
 */

//TODO
// 1. Создать 4 Сервлета и 4 JSP страницы связанных с ними;
// 2. 2 пары связать с помощью конфигурации web.xml;
// 3. 2 пары связать с помощью аннотаций;
// 4. На каждой странице сделать ссылку на другую страницу.
// 5. Наполнение страниц не имеет значения. Какая страница какую ссылку будет иметь также не имеет значения, главное чтобы не было ситуации, когда перешел на jsp и из нее не было ссылки на другую (тупик)


@WebServlet("/orderedgoods")
public class CompaniesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("OrderedGoods.jsp").forward(req, resp);
    }
}
