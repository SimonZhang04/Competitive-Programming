while True:
  line = input().split(" ")
  n = int(line[0])
  if n == 0:
    break
  temperatures = line[1:]
  differences = []
  for x in range(1, n):
    differences.append(int(temperatures[x]) - int(temperatures[x-1]))


  pattern = []
  for difference in differences:
    works = True
    diffCopy = differences[:]
    blocks = []
    pattern.append(difference)
    while len(diffCopy) >= len(pattern):
      blocks.append(diffCopy[:len(pattern)])
      del diffCopy[:len(pattern)]
    if len(diffCopy) > 0:
      blocks.append(diffCopy[:])
    for x in range(1, len(blocks)-1):
      if blocks[x] != blocks[x-1]:
        works = False
    for x in range(len(blocks[-1])):
      if blocks[-1][x] != pattern[x]:
        works = False
    if works:
      break
  print(len(pattern))