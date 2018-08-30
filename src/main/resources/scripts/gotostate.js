   var m1 = new joint.shapes.devs.Model({
        position: { x: 50, y: 50 },
        size: { width: 90, height: 90 },
        inPorts: ['in'],
        
        ports: {
            groups: {
                'in': {
                    attrs: {
                        '.port-body': {
                            fill: '#16A085',
                            magnet: 'passive'
                        }
                    }
                },
                
            }
        },
        attrs: {
            '.label': { text: 'Go to state', 'ref-x': .5, 'ref-y': .2 },
            rect: { fill: '#2ECC71' }
        }
    }).addTo(graph);