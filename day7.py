"""
shinyGoldHolders = []
holdGoldHolders = []
countedBags = []
count = 0
listOfRules = []
"""
def getBags(rule):
  """ This function takes a line of input and returns
  the bags as a list. The 0th index of the list is the
  bag that contains the other bags"""
  ruleSplit = rule.split(" ")
  bags = []
  bagSplitters = ["bag", "bag.", "bag,", "bags", "bags.", "bags,"]
  for x in range(len(ruleSplit)):
      if ruleSplit[x] in bagSplitters:
          bag = ruleSplit[x-2] + " " + ruleSplit[x-1]
          bags.append(bag)
  return bags
"""
while True:
  rule = input()
  listOfRules.append(rule)
  if rule == "0":
    break
  if "shiny gold" in rule:
    if getBags(rule)[0] != "shiny gold":
      shinyGoldHolders.append(getBags(rule)[0])
      countedBags.append(getBags(rule)[0])
count += len(shinyGoldHolders)

while True:
  for elem in listOfRules:
    for x in range(1, len(getBags(elem))):
      if getBags(elem)[x] in shinyGoldHolders and getBags(elem)[0] not in holdGoldHolders and getBags(elem)[0] not in countedBags:
        holdGoldHolders.append(getBags(elem)[0])
        countedBags.append(getBags(elem)[0])
  if len(holdGoldHolders) == 0:
    break
  count += len(holdGoldHolders)
  shinyGoldHolders = holdGoldHolders
  holdGoldHolders = []

print(count)
"""


# shiny gold bags contain 5 vibrant green bags, 4 pale violet bags, 4 dull olive bags, 3 pale white bags.
def getBagNumbers(rule):
  """ This function takes a line of input and returns
  the number of each bag and their bag as a nested list. It does not include the bag in which the bags are in"""
  ruleSplit = rule.split(" ")
  bags = []
  bagSplitters = ["bag", "bag.", "bag,", "bags", "bags.", "bags,"]
  for x in range(3,len(ruleSplit)):
      if ruleSplit[x] in bagSplitters:
        bagNumbers = int(ruleSplit[x-3])
        bag = ruleSplit[x-2] + " " + ruleSplit[x-1]
        bagCombo = [bagNumbers,bag]
        bags.append(bagCombo)
  return bags
def applyMultiplier(bagNumbers):
    for elem in bagNumbers:
        elem[0] *= multiplier
    return bagNumbers
# ['5 vibrant green', '4 pale violet', '4 dull olive', '3 pale white']
listOfRules = []


while True:
  rule = input()
  if rule == "0":
    break
  listOfRules.append(rule)

for elem in listOfRules:
  if getBags(elem)[0] == "shiny gold":
    groupLine = getBagNumbers(elem)
count = 0
newGroupLine = []

for x in range(8):
  for x in range(len(groupLine)):
    # searching for each bag in the groupLine
    searchingFor = groupLine[x][1]
    # looping over the list to find the "searchingFor"
    for elem in listOfRules:
      if "no" in elem:
        continue
      # if we find the bag we are searching for
      if getBags(elem)[0] == searchingFor:
        # save the multipier of the bag we were searching for
        multiplier = groupLine[x][0]
        # multiply the contains of the bag by the multipier
        searchingForContains = applyMultiplier(getBagNumbers(elem))
        # add each element of the bag into the next groupline
        for elem in searchingForContains:
          newGroupLine.append(elem)
        # add the multiplier to the total count
        count += multiplier
        print(count)

  groupLine = newGroupLine
  newGroupLine = []


# last count

for elem in groupLine:
  count += elem[0]
print(count)
# if the the first bag is in goldBagHolds