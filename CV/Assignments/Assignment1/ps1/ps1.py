import cv2
import numpy as np

# Save off image 1 and 2
image1 = cv2.imread('.\input\ps1-1-a-1.png')
image2 = cv2.imread('.\input\ps1-1-a-2.png')

# Split into channels
blue1, green1, red1 = cv2.split(image1)
blue2, green2, red2 = cv2.split(image2)

# Question 2
# Part a - Swap red and blue pixels of image 1
blue1, green1, red1 = cv2.split(image1)
blue2, green2, red2 = cv2.split(image2)

new = np.zeros(image1.shape)
new[:,:,0] = red1
new[:,:,1] = green1
new[:,:,2] = blue1
cv2.imwrite('.\output\ps1-2-a-1.png', new)

# Part b - Create monochrome image of image 1 by selecting green channel
cv2.imwrite('.\output\ps1-2-b-1.png', green1)

# part C - Select red channel of image image1
cv2.imwrite('.\output\ps1-2-c-1.png', red1)

# Question 3
# Part a - Take center square region of 100x100 pixels of image 1 and insert them into
# center of monochrome version of image 2 
height1, width1, depth1 = image1.shape
height2, width2, depth2 = image2.shape

image1_crop = green1[ height1/2-50:height1/2+50, width1/2-50:width1/2+50]
image2_overlay = green2
image2_overlay[ height2/2-50:height2/2+50, width2/2-50:width2/2+50 ] = image1_crop
cv2.imwrite('.\output\ps1-3-a-1.png', image2_overlay)

# Question 4
# Part a - Compute min, max, mean, std dev of pixel values in image 1 green
max1 = np.max(green1)
min1 = np.min(green1)
mean1 = np.mean(green1)
std1 = np.std(green1)
print 'Image 1 Green Channel max = ', np.max(green1)
print 'Image 1 Green Channel min =', np.min(green1)
print 'Image 1 Green Channel mean =', np.mean(green1)
print 'Image 1 Green Channel std dev =', np.std(green1)

# Part b - Manipulate image using image statistics
green1_manip = (10*(green1 - mean1)/std1) + mean1
cv2.imwrite('.\output\ps1-4-b-1.png', green1_manip)

# Part c - Shift image 1 green to the left by 2 pixels
blue_temp, green_temp, red_temp = cv2.split(image1)
green1L = green1
shift = 2
green1L[ :, 0:green1.shape[1]-shift ] = green1L[ : , shift:green1.shape[1] ]
cv2.imwrite('.\output\ps1-4-c-1.png', green1L)

# Part d - Subtract the shifted version of image 1 green from the original one
#green1_diff = (green1 - green1L) + (green1L - green1)
green1_diff = green_temp.astype('float') - green1L.astype('float')
cv2.imwrite('.\output\ps1-4-d-1.png', abs(green1_diff))

# Question 5
# Save off image 1 and 2
image1 = cv2.imread('.\input\ps1-1-a-1.png')

# Split into channels
blue1, green1, red1 = cv2.split(image1)

# Part a - Take original colored image 1 and add Gaussian noise to pixels in green channel
sigma = 10
noise = np.random.normal(0, sigma, image1.shape[0:2])
green1_noise = green1 + noise

new = np.zeros(image1.shape)
new[:,:,0] = blue1
new[:,:,1] = green1_noise
new[:,:,2] = red1
cv2.imwrite('.\output\ps1-5-a-1.png', new)

# Part b - Add noise to blue channel
blue1_noise = blue1 + noise

new = np.zeros(image1.shape)
new[:,:,0] = blue1_noise
new[:,:,1] = green1
new[:,:,2] = red1
cv2.imwrite('.\output\ps1-5-b-1.png', new)
