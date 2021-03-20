from collections import Counter

n= int(input())
readings = []
for x in range(n):
  reading = int(input())
  readings.append(reading)
readings = [item for items, c in Counter(readings).most_common() for item in [items] * c]

frenquency1 = readings.count(readings[0])
frenquency2 = readings.count(readings[frenquency1])
possible_nums = [readings[frenquency1-1], readings[frenquency1]]
skipper = frenquency1 + frenquency2
while skipper < len(readings):
  if readings.count(readings[skipper]) == frenquency2:
    possible_nums.append(readings[skipper])
    skipper += frenquency2
  else:
    break

if frenquency1 > frenquency2:
  number1 = readings[0]
  del possible_nums[0]
  largest_difference = 0
  for x in range(len(possible_nums)):
    if abs(number1 - possible_nums[x]) >largest_difference:
      largest_difference = abs(number1 - possible_nums[x])
else:
  x = sorted(possible_nums)
  largest_difference = x[-1] - x[0]
print(largest_difference)