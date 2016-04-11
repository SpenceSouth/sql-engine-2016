# Create Database
# Drop Database
# Create Table
# Drop Table
# Insert into Table
# SELECT FROM table with compound statement
# Update table
# Delete from table with compound statement

import os
import shutil


def run(command):
    os.system(command + ' > .temp')


if os.path.isfile('SQLEngine.jar'):
    path = '-jar SQLEngine.jar'
else:
    path = 'out/Production/SQLEngine/Project'

print 'Testing CREATE DATABASE'
run('java ' + path + ' "CREATE DATABASE test;"')
database_created = os.path.isdir('databases/test')

print 'Testing DROP DATABASE'
run('java ' + path + ' "DROP DATABASE test;"')
database_dropped = os.path.isdir('databases/test')

# CREATE TABLE
print 'Testing CREATE TABLE'
run('java ' + path + ' "CREATE DATABASE a; CREATE TABLE b (id int);"')

temp = open('.temp', 'r')

table_created = os.path.isfile('databases/a/b.xml')

temp.close()

# DROP TABLE
print 'Testing DROP TABLE'
run('java ' + path + ' "LOAD DATABASE a; DROP TABLE b;"')

temp = open('.temp', 'r')

table_dropped = not os.path.isfile('databases/a/b.xml')

temp.close()

# INSERT INTO table with compound statement
print 'Testing INSERT INTO'
run('java ' + path + ' "LOAD DATABASE a; CREATE TABLE b (id int, name varchar(10), comment char(10), code int(5), '
                     'salary number); INSERT INTO b VALUES(0, \'Spence\', \'a\', 3, 12345);"')

temp = open('.temp', 'r')

insert_successful = False

for line in temp.readlines():
    print line
    if line.__contains__('Successfully inserted into b'):
        insert_successful = True
        break
    else:
        insert_successful = False

temp.close()

# UPDATE table with compound statement
print 'Testing UPDATE TABLE'
run('java ' + path + ' "LOAD DATABASE a;  INSERT INTO b VALUES(1, \'Gary\', \'comment\', 30, 12345); '
                     'UPDATE b SET name = \'Roger\' WHERE comment = \'a\' OR salary = 12345;"')

temp = open('.temp', 'r')

update_successful = False

for line in temp.readlines():
    if line.__contains__('2 record(s) updated'):
        update_successful = True
        break
    else:
        update_successful = False

temp.close()

# DELETE FROM table with compound statement
print 'Testing DELETE FROM'
run('java ' + path + ' "LOAD DATABASE a;  '
                     'INSERT INTO b VALUES(2, \'Jones\', \'faega\', 32, 23523); '
                     'INSERT INTO b VALUES(3, \'Brian\', \'qegqr\', 33, 32792); '
                     'INSERT INTO b VALUES(4, \'Tyrion\', \'agear\', 34, 23948); '
                     'INSERT INTO b VALUES(5, \'Rick\', \'qegrs\', 33, 23942); '
                     'INSERT INTO b VALUES(6, \'Cassie\', \'egqwe\', 122, 23842); '
                     'INSERT INTO b VALUES(7, \'Dan\', \'qwegs\', 3, 23094); '
                     'SELECT * FROM b; '
                     'DELETE FROM b WHERE code > 30 AND salary < 30000 OR name = \'Roger\'; '
                     'SELECT * FROM b;"')

temp = open('.temp', 'r')

delete_successful = False

for line in temp.readlines():
    if line.__contains__('6 record(s) deleted.'):
        delete_successful = True
        break
    else:
        delete_successful = False

temp.close()

# Clean up
shutil.rmtree('databases/a')


# Blank lines for formatting
print ''
print ''

if database_created:
    print 'PASS - CREATE DATABASE'
else:
    print 'FAIL - CREATE DATABASE'

if database_created:
    print 'PASS - DROP DATABASE'
else:
    print 'FAIL - DROP DATABASE'

if table_created:
    print 'PASS - CREATE TABLE'
else:
    print 'FAIL - CREATE TABLE'

if table_dropped:
    print 'PASS - DROP TABLE'
else:
    print 'FAIL - DROP TABLE'

if insert_successful:
    print 'PASS - INSERT INTO'
else:
    print 'FAIL - INSERT INTO'

if update_successful:
    print 'PASS - UPDATE RECORD'
else:
    print 'FAIL - UPDATE RECORD'

if delete_successful:
    print 'PASS - DELETE RECORDS (compound)'
else:
    print 'FAIL - DELETE RECORDS (compound)'

