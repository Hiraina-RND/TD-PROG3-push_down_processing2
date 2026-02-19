CREATE DATABASE "election_db";

CREATE USER "election_db_manager" WITH PASSWORD '123456';

ALTER DATABASE "election_db" OWNER TO "election_db_manager";