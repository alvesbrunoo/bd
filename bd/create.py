import sqlite3

connection = sqlite3.connect('title.db')

cursor = connection.cursor()

cursor.execute("""
CREATE TABLE movies (
    id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
    name TEXT NOT NULL,
    year INTEGER NOT NULL,
    score REAL NOT NULL
    );
""")

connection.commit()
print('Dados inseridos com sucesso!')
connection.close()