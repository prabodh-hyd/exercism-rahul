//
// This is only a SKELETON file for the 'Series' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export class Series {
  constructor(series) {
    if (!series) throw new Error('series cannot be empty')
    this.s = series.split('').map(Number)
  }
  slices(l) {
    if (l < 0) throw new Error('slice length cannot be negative')
    if (l === 0) throw new Error('slice length cannot be zero')
    if (l > this.s.length) throw new Error('slice length cannot be greater than series length')
    const res = []
    for (let i = 0; i <= this.s.length - l; i++) {
      res.push(this.s.slice(i, i + l))
    }
    return res
  }
}

