from fernet import flask, request,render_template,redirect
import os
import sqlite3

currentlocation =os.path.dirname(os.path.abspath(__file__))

myapp= flask(__name__)

@myapp.route("/")
def homepage():
    return render_template("")

@myapp.route("/", methods = ["POST"])
def checklogin():
    UN=request.form['Username']
    PW=request.form['Password']

    sqlconnection = sqlite3.Connection(currentlocation + "\Login.db")
    cursor=sqlconnection.cursor()
    query1 = "SELECT Username,Password From Users WHERE Username ={un} AND Password ={pw}".format(un =UN,pw =PW)




if __name__ == "__main__" :
    myapp.run()