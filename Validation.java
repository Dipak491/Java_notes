package com.main;




import java.util.concurrent.*;
import java.util.*;

public class Validation
{
  private static final int TOTAL_VALIDATION_LICENSES = 3; //variable 
  private static final int TOTAL_TRANSLATION_LICENSES = 4; 
  
  private static Semaphore validationSemaphore = new Semaphore(TOTAL_VALIDATION_LICENSES);
  private static Semaphore translationSemaphore = new Semaphore(TOTAL_TRANSLATION_LICENSES);
  
  public static void main(String[] args) {
      // Simulate LicenseCheck.exe output
      int availableValidationLicenses = 1;
      int availableTranslationLicenses = 2;
      
      if (availableValidationLicenses > 0 && availableTranslationLicenses > 0) {
          System.out.println("Both licenses are available.");
          
          try {
              acquireValidationLicense();
              acquireTranslationLicense();
              
              System.out.println("Validation and Translation processes are now running...");
              
              
              Thread.sleep(3000);
              
              releaseValidationLicense();
              releaseTranslationLicense();
              
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
          
      } else {
          long startTime = System.currentTimeMillis();
          
          if (availableValidationLicenses <= 0) {
              System.out.println("Waiting for a Validation license...");
              waitAndAcquireValidationLicense();
          }
          
          if (availableTranslationLicenses <= 0) {
              System.out.println("Waiting for a Translation license...");
              waitAndAcquireTranslationLicense();
          }
          
          long endTime = System.currentTimeMillis();
          long waitTime = endTime - startTime;
          System.out.println("Waited for licenses: " + waitTime + " milliseconds");
          
          System.out.println("Validation and Translation processes are now running...");
          
          try {
              acquireValidationLicense();
              acquireTranslationLicense();
              
              
              Thread.sleep(3000); 
              
              releaseValidationLicense();
              releaseTranslationLicense();
              
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
  }
  
  private static void acquireValidationLicense() throws InterruptedException {
      validationSemaphore.acquire();
  }
  
  private static void acquireTranslationLicense() throws InterruptedException {
      translationSemaphore.acquire();
  }
  
  private static void waitAndAcquireValidationLicense() {
      try {
          validationSemaphore.acquire();
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
  }
  
  private static void waitAndAcquireTranslationLicense() {
      try {
          translationSemaphore.acquire();
      } catch (InterruptedException e) {
      }
  }

  
private static void releaseValidationLicense() {
  validationSemaphore.release();
}

private static void releaseTranslationLicense() {
  translationSemaphore.release();
}


}
