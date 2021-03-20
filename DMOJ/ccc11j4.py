x = -1
y = -5
bored = [[0,- 1], [0,-2], [0, -3], [1, -3], [2, -3],
[3,-3], [3,-4], [3,-5], [4,-5], [5,-5], [5,-4], [5,-3],
[6,-3], [7,-3], [7,-4], [7,-5], [7, -6], [7,-7], [6,-7],
[5,-7], [4,-7], [3,-7], [2,-7], [1,-7], [0,-7], [-1,-7],
[-1, -6], [-1, -5]]

while True:
    command = input().split()
    direction = command[0]
    length = int(command[1])
    safe = True
    if direction == 'q':
        break
    elif direction == 'd':
        for q in range(length):
            y -= 1
            coord = [x, y]
            if coord in bored:
                safe = False
            else:
                bored.append(coord)

    elif direction == 'u':
       for q in range(length):
            y += 1
            coord = [x, y]
            if coord in bored:
                safe = False
            else:
                bored.append(coord)

    elif direction == 'l':
       for q in range(length):
            x -= 1
            coord = [x, y]
            if coord in bored:
                safe = False
            else:
                bored.append(coord)
    elif direction == 'r':
       for q in range(length):
            x += 1
            coord = [x, y]
            if coord in bored:
                safe = False
            else:
                bored.append(coord)

    if not safe:
        print(f"{coord[0]} {coord[1]} DANGER")
        break
    else:
        print(f"{coord[0]} {coord[1]} safe")