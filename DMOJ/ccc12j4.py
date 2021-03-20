k = int(input())
msg = input()

for p in range(1, len(msg)+1):
    shift = 3 * p + k
    letter = msg[p-1]
    letterVal = ord(letter) - shift
    if letterVal < 65:
        letterVal += 26
    print(chr(letterVal), end="")
