import math


	length = float(input("Enter the length of the side of the equilateral triangle: "))


	area = (math.sqrt(3) / 4) * (length ** 2)


	volume = area * length


print(f"Area of the equilateral triangle: {area:.2f}")
print(f"Volume of the extruded triangle (prism): {volume:.2f}")
