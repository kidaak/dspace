package org.dspace.app.webui.servlet;

import org.apache.log4j.Logger;
import org.dspace.app.webui.util.JSPManager;
import org.dspace.authorize.AuthorizeException;
import org.dspace.core.Context;
import org.dspace.storage.rdbms.DatabaseManager;
import org.dspace.storage.rdbms.TableRowIterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

/**
 * Created by lalka on 12/23/2015.
 */
public class SystemsServlet extends DSpaceServlet{

    /** Logger */
    private static Logger log = Logger.getLogger(EditProfileServlet.class);

    protected void doDSGet(Context context, HttpServletRequest request,
                           HttpServletResponse response) throws ServletException, IOException,
            SQLException, AuthorizeException{
        TableRowIterator tri = DatabaseManager.queryTable(context, "systems", "SELECT * FROM systems");


        PrintWriter out = response.getWriter();
     //   out.write(tri.next().getStringColumn("name"));
   //     out.close();

        request.setAttribute("systems", tri);
        request.getRequestDispatcher("/system/system-home.jsp").forward(request, response);
    }

    protected void doDSPost(Context context, HttpServletRequest request,
                           HttpServletResponse response) throws ServletException, IOException,
            SQLException, AuthorizeException{


    }
}
