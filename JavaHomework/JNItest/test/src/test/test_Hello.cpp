#include <jni.h>
#include "test_Hello.h"
#include <cstdio>
/*
 * Class:     test_Hello
 * Method:    HelloFromCpp
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_test_Hello_HelloFromCpp
  (JNIEnv *, jobject){
      printf("Hello world!I am from C plus plus!\n");
  }

