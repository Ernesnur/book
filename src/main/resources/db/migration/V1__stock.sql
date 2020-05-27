CREATE TABLE book(
  ID INTEGER PRIMARY KEY AUTOINCREMENT,
  BOOK_ID VARCHAR(30) NOT NULL,
  NAME VARCHAR(300) NOT NULL,
  AUTHOR VARCHAR(300),
  EDITOR VARCHAR(300),
  PUBLISHER VARCHAR(300),
  BOOK_YEAR INTEGER,
  BOOK_WEIGHT INTEGER,
  RATING DOUBLE,
  ABOUT TEXT,
  PRICE DOUBLE
);
