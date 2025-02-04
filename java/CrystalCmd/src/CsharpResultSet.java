import java.io.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.ResultSet;
//import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.h2.store.fs.FileUtils;
import org.h2.tools.Csv;
import org.h2.tools.SimpleResultSet;


public class CsharpResultSet {

    public ResultSet Execute(String csv) throws SQLException, IOException {


        //Class.forName("org.h2.Driver");
        //Connection conn = DriverManager
        //		.getConnection("jdbc:h2:mem:myDb;", "sa", "");
        // add application code here
        Reader reader = new StringReader(csv);
//         ResultSet rs = new Csv().read(reader, null);
        ResultSet rs = new CsvReader().read(reader);


        /*ResultSetMetaData meta = rs.getMetaData();
        while (rs.next()) {
            for (int i = 0; i < meta.getColumnCount(); i++) {
                System.out.println(
                    meta.getColumnLabel(i + 1) + ": " +
                    rs.getString(i + 1));
            }
            System.out.println();
        }
        rs.close();
        */

        //conn.close();

        return rs;
    }


}
