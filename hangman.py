from random import choice
from os import system

illegal_characters = "!@#$%^&*()-_=+['\",<.>/?;:~`1234567890" 
file = "words.txt"

def generate_word(word_list_file=None):
	if word_list_file == None:
		raise OSError("File not specified")

	with open(word_list_file, "r") as file:
		return choice(file.readlines())

def display_game(player_guessed_words=None, lives=None, guessed_characters=None):
	if player_guessed_words == None or lives == None or guessed_characters == None:
		raise OSError("Something not specified...")

	system("cls")
	print("HANGMAN GAME")
	print("~"*20)
	print(f"Lives: {lives}")
	print("Guessed Characters: ", end="")
	for character in guessed_characters: 
		print(character, end=" ")

	print("\n")
	for character in player_guessed_words:
		print(character, end=" ")
	else:
		print("\n")
	return str(input("Enter a letter: ")).lower()

def generate_player_word_guess(generated_word=None):
	if generated_word == None:
		raise OSError("Word or Lives not specified")

	starter_list = list()
	for index in range(len(generated_word)-1):
		starter_list.append("_")

	return starter_list

def valid_character(guessed_character=None):
	if guessed_character == None:
		raise OSError("Hey! no character was choosen...")

	if len(guessed_character) > 1 or guessed_character in illegal_characters:
		return False

	return True


generated_word = generate_word(file)
player_guessed_word = generate_player_word_guess(generated_word)
words_already_guessed = list()
guessed_correctly = False
LIVES = 6

while True:
	guessed_character = display_game(player_guessed_word, LIVES, words_already_guessed)

	if not valid_character(guessed_character):
		print("Invalid character!")
		input("Press 'ENTER' to continue...")
		continue

	if guessed_character in words_already_guessed:
		print("You guessed that character already!")
		input("Press 'ENTER' to continue...")
		continue

	for position, character in enumerate(generated_word):
		if character.lower() == guessed_character:
			guessed_correctly = True
			player_guessed_word[position] = character

	if not guessed_correctly:
		LIVES -= 1
		if LIVES <= 0:
			system("cls")
			print("YOU LOSE!")
			print(f"The word was {generated_word}")
			break

	if "_" not in player_guessed_word:
		system("cls")
		print("YOU WON!")
		print(f"The word was {generated_word}")
		break

	words_already_guessed.append(guessed_character)
	guessed_correctly = False


# EOF