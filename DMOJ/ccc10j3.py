ok = {
"A" : 0,
"B" : 0
}

while True:
    line = input()
    execution = line.split(" ")
    if execution[0] == "1":
        ok[execution[1]] = int(execution[2])

    elif execution[0] == "2":
        print(ok[execution[1]])

    elif execution[0] == "3":
        ok[execution[1]] += ok[execution[2]]

    elif execution[0] == "4":
        ok[execution[1]] *= ok[execution[2]]

    elif execution[0] == "5":
        ok[execution[1]] -= ok[execution[2]]

    elif execution[0] == "6":
        ok[execution[1]] //= ok[execution[2]]
    else:
        break