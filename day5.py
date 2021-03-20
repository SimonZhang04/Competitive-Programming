def binaryToDecimal(n):
    return int(n,2)

listOfSeats = []
lowestID = 1000
highestID = 0
count = 0
while True:
  seat = input()
  if seat == "0":
    break
  row = ""
  column = ""
  for x in range(7):
    if seat[x] == "F":
      row += "0"
    else:
      row += "1"
  for x in range(3):
    if seat[x+7] == "L":
      column += "0"
    else:
      column += "1"
  row = binaryToDecimal(row)
  column = binaryToDecimal(column)
  seatID = row * 8 + column
  if seatID > highestID:
    highestID = seatID
  if seatID < lowestID:
    lowestID = seatID
  listOfSeats.append(seatID)

for x in range(48, 922):
  if x not in listOfSeats:
    print(x)