x = int(input())
y = int(input())

count = 2

while True:
    diff = x-y
    if diff < 0:
        break
    else:
        count += 1
        x = y
        y = diff

print(count)