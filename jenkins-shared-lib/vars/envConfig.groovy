def call(String env) {
    def configs = [
        dev: [
            AWS_REGION: 'ap-south-1',
            CLUSTER: 'dev-cluster',
            infra_image: 'ubuntu',
            infra_tag: 'noble'
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