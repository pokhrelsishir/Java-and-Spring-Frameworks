try {
    Statement stmnt = conn.createStatement();

    try {
        ResultSet rs = stmnt.executeQuery("SELECT COUNT(*) FROM foo");

        try{
            rs.next();
            int cnt = rs.getInt(1);
        } finally {
            rs.close();
        }    
    } finally {
        stmnt.close();
    }
} catch (SQLException e) {
    // handle error
} finally {
    try {
        conn.close();
    } catch (SQLException e) {
        // handle error
    }
}