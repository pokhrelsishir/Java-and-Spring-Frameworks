int cnt = new JdbcTemplate(ds).queryForInt("SELECT COUNT(*) FROM foo");