count = 0
count2 = 0
while True:
  line = input()
  if line == "0":
    break
  else:
    policy = line.split(":")[0]
    password = line.split(":")[1]
    numRange = policy.split(" ")[0]
    atLeast = int(numRange.split("-")[0])
    atMost = int(numRange.split("-")[1])
    policyLetter = policy.split(" ")[1]
    if password.count(policyLetter) >= atLeast and password.count(policyLetter) <= atMost:
      count += 1
    if (password[atLeast] == policyLetter or password[atMost] == policyLetter) and password[atLeast] != password[atMost]:
      count2 += 1

print(count)
print(count2)
