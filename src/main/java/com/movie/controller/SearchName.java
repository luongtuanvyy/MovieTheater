package com.movie.controller;

import com.movie.entity.User;
import com.movie.service.UserService;
import com.movie.service.implement.UserServiceImplement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
@WebServlet(urlPatterns = {"/admin/user/search"})
public class SearchName extends HttpServlet {

    private UserService userService;

    @Override
    public void init() throws ServletException {
        userService = new UserServiceImplement();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            resp.setContentType("text/html");
            resp.setCharacterEncoding("UTF-8");
            String nameToSearch = req.getParameter("name");
            List<User> users = userService.findByName(nameToSearch);

            PrintWriter out = resp.getWriter();
            for (User user : users) {
                String status = (user.isActive()) ? "Hoạt động" : "Không hoạt động";
                String color = (user.isActive()) ? "green" : "red";
                String member = (user.isMember()) ? "Có" : "Không";
                out.println("                            <tr class=\"border-b dark:border-gray-700\">\n" +
                        "                                <th scope=\"row\"\n" +
                        "                                    class=\"flex items-center space-x-4 px-4 py-3 font-medium text-gray-900 whitespace-nowrap dark:text-white\">\n" +
                        "                                    <div class=\"overflow-hidden rounded-lg\">\n" +
                        "                                        <img src=\"" + user.getAvatar() + "\"\n" +
                        "                                             alt=\"\" class=\"h-12 rounded-full\">\n" +
                        "                                    </div>\n" +
                        "                                    <div>\n" +
                        "                                        <p class=\"\">" + user.getFirstName() + " " + user.getLastName() + "</p>\n" +
                        "                                        <p class=\"text-xs text-gray-500\">" + user.getEmail() + "</p>\n" +
                        "                                    </div>\n" +
                        "                                </th>\n" +
                        "                                <td class=\"px-4 py-3 text-sm font-medium\">" + user.getUserName() + "</td>\n" +
                        "                                <td class=\"px-4 py-3 text-sm font-medium\">" + user.getPhone() + "</td>\n" +
                        "                                <td class=\"px-4 py-3 text-sm font-medium\">\n" +
                        "                                    <div class=\"flex items-center space-x-3\">\n" +
                        "                                       <div class=\"h-2 w-2 bg-" + color + "-500 rounded-full\"></div>\n" +
                        "                                       <span>" + status + "</span>\n" +
                        "                                    </div>\n" +
                        "                                </td>\n" +
                        "                                <td class=\"px-4 py-3 text-sm font-medium\">$299.222</td>\n" +
                        "                                <td class=\"px-4 py-3 text-sm font-medium\">\n" +
                        "                                     <p>" + member + "</p>\n" +
                        "                                </td>\n" +
                        "                                <td class=\"px-4 py-3\">\n" +
                        "                                    <button id=\"apple-imac-27-dropdown-button\"\n" +
                        "                                            data-dropdown-toggle=\"apple-imac-27-dropdown\" data-dropdown-placement=\"left\"\n" +
                        "                                            class=\"inline-flex items-center p-0.5 text-sm font-medium text-center text-gray-500 hover:text-gray-800 rounded-lg focus:outline-none dark:text-gray-400 dark:hover:text-gray-100\"\n" +
                        "                                            type=\"button\">\n" +
                        "                                        <svg class=\"w-5 h-5\" aria-hidden=\"true\" fill=\"currentColor\"\n" +
                        "                                             viewbox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\">\n" +
                        "                                            <path\n" +
                        "                                                    d=\"M6 10a2 2 0 11-4 0 2 2 0 014 0zM12 10a2 2 0 11-4 0 2 2 0 014 0zM16 12a2 2 0 100-4 2 2 0 000 4z\"/>\n" +
                        "                                        </svg>\n" +
                        "                                    </button>\n" +
                        "                                    <div id=\"apple-imac-27-dropdown\"\n" +
                        "                                         class=\"hidden z-10 w-44 bg-white rounded divide-y divide-gray-100 shadow dark:bg-gray-700 dark:divide-gray-600\">\n" +
                        "                                        <ul class=\"py-1 text-sm text-gray-700 dark:text-gray-200\"\n" +
                        "                                            aria-labelledby=\"apple-imac-27-dropdown-button\">\n" +
                        "                                            <li>\n" +
                        "                                                <a href=\"#\"\n" +
                        "                                                   class=\"block py-2 px-4 hover:bg-gray-100 dark:hover:bg-gray-600 dark:hover:text-white\">Sửa</a>\n" +
                        "                                            </li>\n" +
                        "                                            <li>\n" +
                        "                                                <a href=\"#\"\n" +
                        "                                                   class=\"block py-2 px-4 hover:bg-gray-100 dark:hover:bg-gray-600 dark:hover:text-white\">Xóa</a>\n" +
                        "                                            </li>\n" +
                        "                                        </ul>\n" +
                        "                                    </div>\n" +
                        "                                </td>\n" +
                        "                            </tr>");
            }
        }

}
