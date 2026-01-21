def call(String env) {
    def configs = [
        dev: [
            AWS_REGION: 'ap-south-1',
            CLUSTER: 'dev-cluster',
            IMAGE_NAME: 'ubuntu',
            IMAGE_TAG: 'noble'
        ],
        uat: [
            AWS_REGION: 'ap-south-1',
            CLUSTER: 'uat-cluster'
        ],
        prod: [
            AWS_REGION: 'ap-south-1',
            CLUSTER: 'prod-cluster'
        ]
    ]
    return configs[env]
}