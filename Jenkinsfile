// pipeline {
//   agent any
// //================= Environment Variable ==============================
//   environment {
//       SHOW_ENV_VAR = '0'
//
//       BUILD_SERVICE_REGISTRY = '0'
//       BUILD_CONFIG_SERVER = '0'
//       BUILD_SPRINGBOOT_ADMIN = '0'
//       TRANSFER_ZIPKIN_SERVICE = '0'
//
//       BUILD_SYSTEM_SERVICE = '0'
//       BUILD_SUMMARY_REPORT = '0'
//       BUILD_FIXED_ASSET = '0'
//       BUILD_RENTAL_ASSET = '0'
//       BUILD_TOOLS_EQUIP = '0'
//
//       BUILD_AUTH_SERVICE = '0'
//       BUILD_EDGE_SERVICE = '0'
//       BUILD_USER_FRONTEND = '1'
//
//       TEST_BUILD = '0'
//
//       RUN_SERVICE_REGISTRY = '0'
//       RUN_DEPARTMENT_SERVICE = '0'
//       RUN_EDGE_SERVICE = '0'
//       RUN_EMPLOYEE_SERVICE_CORE = '0'
//       RUN_CONFIG_SERVER = '0'
//
//   }
//   //==============================================================
//
//   stages {
// //     stage('Show Env Variable'){
// //         when { expression {SHOW_ENV_VAR == '1'}}
// //         steps{
// //             bat "set"
// //         }
// //     }
// //
// //     stage('Build service-registry'){
// // //         when {expression {BUILD_SERVICE_REGISTRY == '1'}}
// //         steps {
// //             bat 'mvn clean install -Dmaven.test.skip=true'
// // //             dir("${WORKSPACE}\\service-registry"){
// // //                 bat 'mvn clean install -Dmaven.test.skip=true'
// // //             }
// //         }
// //     }
// // //
// //     stage('Build edge-service'){
// // //         when {expression {BUILD_EDGE_SERVICE == '1'}}
// //         steps {
// //             bat 'mvn clean install -Dmaven.test.skip=true'
// // //             dir("${WORKSPACE}\\edge-service"){
// // //                 bat 'mvn clean install -Dmaven.test.skip=true'
// // //             }
// //         }
// //     }
//
//     stage('Execute service-registry'){
// //         when {expression {RUN_SERVICE_REGISTRY == '1'}}
//         steps {
//              bat 'java -jar service-registry\\target\\service-registry-0.0.1-SNAPSHOT.jar'
// //              bat 'java -jar edge-service\\target\\edge-service-0.0.1-SNAPSHOT.jar'
//
//         }
//     }
//
//     stage('Execute edge-service'){
// //         when {expression {RUN_EDGE_SERVICE == '1'}}
//         steps {
//             bat 'java -jar edge-service\\target\\edge-service-0.0.1-SNAPSHOT.jar'
//         }
//     }
//
//   }
// }


pipeline {
    agent any

    tools {
        maven 'Maven-Jenkins'
        jdk 'Java-JDK-11'
    }

//     environment {
//             SHOW_ENV_VAR = '0'
//
//             BUILD_SERVICE_REGISTRY = '0'
//             BUILD_CONFIG_SERVER = '0'
//             BUILD_SPRINGBOOT_ADMIN = '0'
//             TRANSFER_ZIPKIN_SERVICE = '0'
//
//             BUILD_SYSTEM_SERVICE = '0'
//             BUILD_SUMMARY_REPORT = '0'
//             BUILD_FIXED_ASSET = '0'
//             BUILD_RENTAL_ASSET = '0'
//             BUILD_TOOLS_EQUIP = '0'
//
//             BUILD_AUTH_SERVICE = '0'
//             BUILD_EDGE_SERVICE = '0'
//             BUILD_USER_FRONTEND = '1'
//
//             TEST_BUILD = '0'
//
//     }

    stages {


         stage('Build SERVICE_REGISTRY') {
            steps {
                dir("${WORKSPACE}\\service-registry"){
//                     bat 'mvn clean install spring-boot:run'
//                     bat 'mvn clean package'
                    bat 'mvn clean install -Dmaven.test.skip=true'
                }
            }
//             post {
//                 success {
//                     bat 'xcopy service-registry\\target\\service-registry-0.0.1-SNAPSHOT.jar D:\\Jenkins_bat'
//                 }
//             }
        }

        stage('Build BUILD_EDGE_SERVICE') {
            steps {
                dir("${WORKSPACE}\\edge-service"){
//                     bat 'mvn clean install spring-boot:run'
//                     bat 'mvn clean package'
                    bat 'mvn clean install -Dmaven.test.skip=true'
                }
            }
//             post {
//                 success {
//                     bat 'xcopy edge-service\\target\\edge-service-0.0.1-SNAPSHOT.jar D:\\Jenkins_bat'
//                 }
//             }
        }

        stage('Build BUILD_CONFIG_SERVER') {
            steps {
                dir("${WORKSPACE}\\config-server"){
//                     bat 'mvn clean install spring-boot:run'
//                     bat 'mvn clean package'
                    bat 'mvn clean install -Dmaven.test.skip=true'
                }
            }
//             post {
//                 success {
//                     bat 'xcopy config-server\\target\\config-server-0.0.1-SNAPSHOT.jar D:\\Jenkins_bat'
//                 }
//             }

        }

//         stage('Run react app'){
//             steps {
//                 dir("D:\\Jenkins_bat\\react"){
//                     bat 'npm install -g serve'
//                     bat 'serve -s build'
//                 }
//             }
//         }

//         stage('RUN_SERVICE_REGISTRY') {
//             steps {
//                 dir("D:\\Jenkins_bat") {
//                        bat 'java -jar service-registry-0.0.1-SNAPSHOT.jar &'
//                 }
//             }
//         }
//
//         stage('RUN_EDGE_SERVICE'){
//             steps {
//                 dir("D:\\Jenkins_bat") {
//                     bat 'java -jar edge-service-0.0.1-SNAPSHOT.jar &'
//                 }
//             }
//         }
//
//         stage('RUN_CONFIG_SERVER'){
//             steps {
//                 dir("D:\\Jenkins_bat") {
//                     bat 'java -jar config-server-0.0.1-SNAPSHOT.jar &'
//                 }
//             }
//         }


//         stage('Run Service-Registry') {
//             steps {
//                 bat 'java -jar service-registry\\target\\service-registry-0.0.1-SNAPSHOT.jar'
//             }
//         }
//
//         stage('Run Edge-Service') {
//             steps {
//                 bat 'java -jar edge-service\\target\\edge-service-0.0.1-SNAPSHOT.jar'
//             }
//         }
//
//         stage('Run Config-Server'){
//             steps {
//                 bat 'java -jar config-server\\target\\config-server-0.0.1-SNAPSHOT.jar'
//             }
//         }
    }
}
