fourDigits = []
lowDigits = []

while True:
  entry = int(input())
  if entry == 0:
    break
  else:
    if entry >= 1000 and entry < 2000:
      fourDigits.append(entry)
    elif entry < 1000:
      lowDigits.append(entry)

# four digits and three digits

# brute force :)))))

for x in range(len(fourDigits)):
  for y in range(len(lowDigits)):
    sum = fourDigits[x] + lowDigits[y]
    if sum == 2020:
      print(fourDigits[x]*lowDigits[y])

# part 2

# two case: 3 lowdigits or 1 fourdigit, 2 low fourDigits

# 3 lowdigits case doesn't work
for x in range(len(lowDigits)):
  for y in range(len(lowDigits)):
    for z in range(len(lowDigits)):
      sum = lowDigits[x] + lowDigits[y] + lowDigits[z]
      if sum == 2020:
        print(lowDigits[x] * lowDigits[y] * lowDigits[z])

# this works
for x in range(len(fourDigits)):
  for y in range(len(lowDigits)):
    for z in range(len(lowDigits)):
      sum = fourDigits[x] + lowDigits[y] + lowDigits[z]
      if sum == 2020:
        print(fourDigits[x] * lowDigits[y] * lowDigits[z])