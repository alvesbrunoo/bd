import sqlite3

connection = sqlite3.connect('title.db')

cursor = connection.cursor()

id = int(input("Informe a id que deseja remover:\n"))

cursor.execute("""
DELETE FROM movies 
WHERE id = ?
""", (id,))

connection.commit()
print('Filme deletado com sucesso!')
connection.close()