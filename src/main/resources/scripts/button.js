   var m1 = new joint.shapes.devs.Model({
        position: { x: 50, y: 50 },
        size: { width: 90, height: 90 },
        outPorts: ['out'],
        ports: {
            groups: {
               
                'out': {
                    attrs: {
                        '.port-body': {
                            fill: '#E74C3C'
                        }
                    }
                }
            }
        },
        attrs: {
            '.label': { text: 'Button', 'ref-x': .5, 'ref-y': .2 },
            rect: { fill: '#2ECC71' }
        }
    }).addTo(graph);