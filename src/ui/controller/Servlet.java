package ui.controller;

import domain.db.RegistratieDB;
import domain.model.Registratie;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/opdracht_get_post_website_war_exploded/Servlet")
public class Servlet extends HttpServlet {
    private RegistratieDB dataBank = new RegistratieDB();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

                String naam = request.getParameter("Voornaam");
                String achternaam = request.getParameter("achternaam");
                String loginnaam = request.getParameter("loginnaam");
                String passwoord = request.getParameter("passwoord");
                String email = request.getParameter("email");
                String niveau = request.getParameter("niveau");

                Registratie voegToe = new Registratie(naam, achternaam, loginnaam, passwoord, email, niveau);
                dataBank.add(voegToe);

            RequestDispatcher view = request.getRequestDispatcher("leden.jsp");
            view.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher view = request.getRequestDispatcher("leden.jsp");
        view.forward(request, response);
    }
}
