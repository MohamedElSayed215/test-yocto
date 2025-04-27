DESCRIPTION = "Custom Yocto image for Raspberry Pi 3 with SSH, Wi-Fi, and Ethernet support"
LICENSE = "MIT"

# Define the base image
IMAGE_INSTALL += "packagegroup-core-boot packagegroup-core-basic"

# Add custom packages
IMAGE_INSTALL += "openssh wpa-supplicant networkmanager raspberrypi-firmware"

# Set up image features (enable SSH)
EXTRA_IMAGE_FEATURES = "ssh-server-openssh"

# Include other recipes or packages as needed
