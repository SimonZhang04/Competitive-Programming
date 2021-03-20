tCount = 0
sCount = 0
for x in range(int(input())):
  line = input().lower()
  tCount += line.count("t")
  sCount += line.count("s")

if tCount > sCount:
  print("English")
else:
  print("French")