number = input()
line = input()
numbers = line.split(" ")
digits = []
output = ""

for x in range(10):
  lowest_digit = x
  for x in range(len(numbers)):
    if int(numbers[x][-1]) == lowest_digit:
      digits.append(int(numbers[x]))

  digits.sort(reverse=True)
  string_digits = ""
  for x in range(len(digits)):
    string_digits += f'{str(digits[x])} '

  output += string_digits
  digits = []

print(output)