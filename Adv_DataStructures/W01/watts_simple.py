"""
Name: Isaac Watts
Date: Jan 26, 2024
Description: A program that asks for your name and prints if it is between A and M or N and Z. 
"""


user = input("Enter your first name: ").upper()
if not user:
    print("Invalid input")
    exit()

if user[0] >= 'A' and user[0] <= 'M':
     print("Your name is in between A and M")
else:
     print("Your name is in between N and Z")


