def contains_vowel(s):
    vowels = 'aeiou'
    for char in s.lower():
        if char in vowels:
            return True
    return False

input_string = "Hello World"
if contains_vowel(input_string):
    print("The string contains a vowel.")
else:
    print("The string does not contain any vowels.")
