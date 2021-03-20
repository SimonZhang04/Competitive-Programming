'''
sumOfCounts = 0
unique = []
while True:
  answer = input()
  if answer == "0":
    break
  for x in range(len(answer)):
    if answer[x] not in unique:
      unique.append(answer[x])
  if answer == "":
    sumOfCounts += len(unique)
    unique = []

print(sumOfCounts)
'''
#part 2

sumOfCounts = 0

group = []

def commonCharacters(group):
  count = 0
  totalcount = 0
  list1 = []
  for x in range(len(group[0])):
    list1.append(group[0][x])
  for elem in list1:
      for x in range(len(group)):
          if elem in group[x]:
              count += 1
      if count == len(group):
          totalcount += 1
      count = 0
  return totalcount

while True:
  answer = input()
  if answer == "0":
    break
  elif answer == "":
    sumOfCounts += commonCharacters(group)
    group = []
  else:
    group.append(answer)

print(sumOfCounts)