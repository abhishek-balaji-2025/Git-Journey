pipeline {
    agent any

    stages {
        stage("Greet user") {
            steps {
                echo "Hello user, Nice to meet you."
            }
        }

        stage("ask user") {
            steps {
                echo "How has your day been?"
            }
        }

        stage("weather updates") {
            steps {
                echo "weather looks good, could have been worse"
            }
        }

        stage("bizarre") {
            steps {
                echo "John's knee grows, friend seems disturbed"
            }
        }

        stage("motivate") {
            steps {
                echo "you have always got it in you, Never give up. You have come a long way!"
            }
        }
    }
}
