import sqlite3

connection = sqlite3.connect('title.db')

cursor = connection.cursor()

id = int(input('Informe a id que deseja alterar:\n'))
name = str(input('Informe o nome do filme:\n'))
year = int(input('Informe o ano do filme:\n'))
score = float(input('Informe a nota do filme:\n'))

cursor.execute("""
UPDATE movies SET name = ?
WHERE id = ?
""", (name, id))

cursor.execute("""
UPDATE movies SET score = ?
WHERE id = ?
""", (score, id))

connection.commit()
print('Dados alterados com sucesso!')
connection.close()