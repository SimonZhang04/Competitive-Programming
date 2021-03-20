count = 0

fields = ["byr", "iyr", "eyr", "hgt", "hcl", "ecl", "pid"]
passport = ""

def validation(passport):
  for x in range(7):
    if passport.find(fields[x]) == -1:
      return False
    else:
      valueIndex1 = passport.find(fields[x])+4
      valueIndex2 = passport.find(" ", valueIndex1)
      value = passport[valueIndex1:valueIndex2]
    #criteria for byr
    if x == 0:
      if int(value) < 1920 or int(value) > 2002:
        return False
    #criteria for iyr
    elif x == 1:
      if int(value) < 2010 or int(value) > 2020:
        return False
    #criteria for eyr
    elif x == 2:
      if int(value) < 2020 or int(value) > 2030:
        return False
    #criteria for hgt
    elif x == 3:
      if "cm" in value:
        height = int(value[:value.find('cm')])
        if height < 150 or height > 193:
          return False
      elif "in" in value:
        height = int(value[:value.find('in')])
        if height < 59 or height > 76:
          return False
      else:
        return False
    #criteria for hcl
    elif x == 4:
      if value[0] != "#":
        return False
      if len(value) != 7:
        return False
      acceptableCharacters = ["a", "b", "c", "d", "e", "f", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
      for x in range(6):
        if value[x+1] not in acceptableCharacters:
          return False
    #criteria ecl
    elif x == 5:
      acceptableColours = ["amb", "blu", "brn", "gry", "grn", "hzl", "oth"]
      if value not in acceptableColours:
        return False
    #criteria pid
    elif x == 6:
      try:
        if len(value) != 9:
          return False
      except:
        return False
  return True

while True:
  line = input()
  if line == "0":
    break
  elif line == "":
    valid = True
    passport += " "
    for x in range(7):
      valid = validation(passport)
      # add part two stuff here
    if valid:
      count += 1
    passport = ""
  else:
    passport += " "
    passport += line

print(count)