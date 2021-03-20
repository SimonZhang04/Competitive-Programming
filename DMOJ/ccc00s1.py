quarters = int(input())
plays1 = int(input())
plays2 = int(input())
plays3 = int(input())
count = 0
while quarters > 0:
  quarters -= 1
  plays1 += 1
  count += 1
  if plays1 == 35:
    quarters += 30
    plays1 = 0
  elif quarters == 0:
    break
  quarters -= 1
  plays2 += 1
  count += 1
  if plays2 == 100:
    quarters += 60
    plays2 = 0
  elif quarters == 0:
    break
  quarters -= 1
  plays3 += 1
  count += 1
  if plays3 == 10:
    quarters += 9
    plays3 = 0

print('Martha plays ' + str(count) + ' times before going broke.')