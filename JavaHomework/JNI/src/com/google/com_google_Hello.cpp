#include <jni.h>
#include <stdio.h>
#include "com_google_Hello.h"
/*
 * Class:     com_google_Hello
 * Method:    HelloFromCpp
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_com_google_Hello_HelloFromCpp
  (JNIEnv *, jobject){
	printf("Hello world!I am from C plus plus!\n");
}