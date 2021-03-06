package nicebank;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Anna on 2017-10-12.
 */
public class WithdrawalServlet extends HttpServlet {
    private Account account;
    private CashSlot cashSlot;

    public WithdrawalServlet(CashSlot cashSlot, Account account) {
        this.cashSlot = cashSlot;
        this.account = account;
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            Teller teller = new AutomatedTeller(cashSlot);
            int amount = Integer.parseInt(request.getParameter("amount"));
            teller.withdrawFrom(account, amount);

            response.setContentType("text/html");
            response.setStatus(HttpServletResponse.SC_OK);
            response.getWriter().println("<html><head><title>Nice Bank ATM</title></head>"
                    + "<body>Please take your $" + amount + "</body></html>");
        }
}
