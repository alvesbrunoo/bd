import sqlite3

connection = sqlite3.connect('title.db')

cursor = connection.cursor()

name = str(input('Qual o nome do filme?\n'))
year = int(input('Qual o ano do filme?\n'))
score = float(input('Qual é a nota do filme?\n'))

cursor.execute("""
INSERT INTO movies (name, year, score)
VALUES (?, ?, ?)
""", (name, year, score))

# cursor.execute("""
# INSERT INTO movies (name, year, score)
# VALUES ('Velozes % Furiosos', 2019, 10)
# """)

connection.commit()
print('Dados inseridos com sucesso!')