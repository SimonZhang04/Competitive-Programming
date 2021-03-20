h = int(input())
waitTime = int(input())
touchesGround = False
for t in range(1, waitTime):
    height = -6 * t * t *t + h*t*t + 2*t + 1
    if height <= 0:
        print(f"The balloon first touches ground at hour:\n {t}")
        touchesGround = True
        break

if not touchesGround:
    print("The balloon does not touch ground in the given time.")
