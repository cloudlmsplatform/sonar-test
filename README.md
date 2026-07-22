SonarQube demo with intentional issues: hardcoded secret, SQL injection, weak crypto, empty catch, NPE. Run: mvn clean verify sonar:sonar -Dsonar.projectKey=sonarqube-demo -Dsonar.host.url=http://HOST:9000 -Dsonar.login=TOKEN

mvn clean verify sonar:sonar \
-Dsonar.projectKey=java-scan \
-Dsonar.host.url=http://13..19:9000 \
-Dsonar.login=sqa_4b154916f3f5a02d6f6 \
-Dsonar.coverage.jacoco.xmlReportPaths=target/site/jacoco/jacoco.xml
