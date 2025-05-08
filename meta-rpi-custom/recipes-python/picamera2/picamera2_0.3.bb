DESCRIPTION = "Picamera2 - Python library for Raspberry Pi Camera using libcamera"
HOMEPAGE = "https://github.com/raspberrypi/picamera2"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=0cce751888df81acbb3fce274ab2bc66"

SRC_URI = "git://github.com/raspberrypi/picamera2.git;branch=main;protocol=https"
SRCREV = "HEAD"

S = "${WORKDIR}/git"

DEPENDS += "python3 python3-pip python3-setuptools python3-numpy libcamera"

inherit setuptools3

RDEPENDS:${PN} += " \
    python3 \
    python3-pillow \
    python3-numpy \
    python3-libcamera \
"

FILES:${PN} += "${libdir} ${datadir}"
